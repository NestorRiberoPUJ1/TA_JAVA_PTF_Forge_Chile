
/*Seleccion de campos y de qué tabla comenzamos*/
/*concat=> es para concatenar textos*/
SELECT clients.client_id AS id, concat(clients.first_name," ",clients.last_name) AS client_name ,
sites.domain_name AS website,
/*AGREGACION PARA JUSTIFICAR EL GROUP BY*/
/*CONTAR LA CANTIDAD DE ELEMENTOS POR EL GRUPO*/
COUNT(sites.site_id) AS number_of_leads,
/*SELECCIONAR LA FECHA MINIMA DEL GRUPO*/
MIN(DATE_FORMAT(leads.registered_datetime,"%M %d,%Y")) AS date_generated
FROM clients
/*UNIR LA TABLA DE SITES por id de cliente*/
JOIN sites ON clients.client_id = sites.client_id
/*UNIR LA TABLA DE LEADS por id del site*/
JOIN leads ON sites.site_id = leads.site_id
/*CONDICIONES PARA LA BUSQUEDA*/
WHERE year(leads.registered_datetime) = 2011
/*AGRUPAMOS PARA PODER EVALUAR LOS ELEMENTOS*/
GROUP BY sites.site_id
/*ORDENAMOS BASADOS EN ALGÚN PARAMETRO*/
ORDER BY id;