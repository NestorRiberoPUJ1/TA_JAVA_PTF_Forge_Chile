package com.ayudantia.relaciones.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import java.util.Date;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "users")
public class User {

  @Id //PK
  @GeneratedValue(strategy = GenerationType.IDENTITY) //AI autoincrement
  private Long id;

  @Size(min = 2, max = 50)
  private String username;

  @Column(updatable = false)
  @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
  private Date created_at;

  @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
  private Date updated_at;

  /* DEFAULT NOW() */
  @PrePersist
  protected void onCreate() {
    this.created_at = new Date();
    this.updated_at = new Date();
  }

  /* NOW() ON UPDATE NOW() */
  @PreUpdate
  protected void onUpdate() {
    this.updated_at = new Date();
  }

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(
    name = "seguidores",
    joinColumns = @JoinColumn(name = "seguidor_id"),
    inverseJoinColumns = @JoinColumn(name = "seguido_id")
  )
  private List<User> seguidos;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(
    name = "seguidores",
    joinColumns = @JoinColumn(name = "seguido_id"),
    inverseJoinColumns = @JoinColumn(name = "seguidor_id")
  )
  private List<User> seguidores;


  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(
    name = "mensajes",
    joinColumns = @JoinColumn(name = "receptor_id"),
    inverseJoinColumns = @JoinColumn(name = "remitende_id")
  )
  private List<Mensajes> mensajes_enviados;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(
    name = "mensajes",
    joinColumns = @JoinColumn(name = "remitende_id"),
    inverseJoinColumns = @JoinColumn(name = "receptor_id")
  )
  private List<Mensajes> mensajes_recibidos;



}
