-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in
-- (30 rows)

SELECT film.title  FROM film
JOIN film_actor ON film_actor.film_id = film.film_id
JOIN actor ON film_actor.actor_id = actor.actor_id
WHERE actor.last_name = 'STALLONE';

-- 2. All of the films that Rita Reynolds has appeared in
-- (20 rows)

SELECT film.title  FROM film
JOIN film_actor ON film_actor.film_id = film.film_id
JOIN actor ON film_actor.actor_id = actor.actor_id
WHERE actor.last_name = 'REYNOLDS' AND actor.first_name = 'RITA';

-- 3. All of the films that Judy Dean or River Dean have appeared in
-- (46 rows)

SELECT film.title  FROM film
JOIN film_actor ON film_actor.film_id = film.film_id
JOIN actor ON film_actor.actor_id = actor.actor_id
WHERE actor.last_name = 'DEAN';


-- 4. All of the the ‘Documentary’ films
-- (68 rows)

SELECT film.title FROM film
JOIN film_category ON film_category.film_id = film.film_id
JOIN category ON film_category.category_id = category.category_id
WHERE category.name = 'Documentary';


-- 5. All of the ‘Comedy’ films
-- (58 rows)

SELECT film.title FROM film
JOIN film_category ON film_category.film_id = film.film_id
JOIN category ON film_category.category_id = category.category_id
WHERE category.name = 'Comedy';

-- 6. All of the ‘Children’ films that are rated ‘G’
-- (10 rows)

SELECT film.title FROM film
JOIN film_category ON film_category.film_id = film.film_id
JOIN category ON film_category.category_id = category.category_id
WHERE category.name = 'Children' AND film.rating = 'G';

-- 7. All of the ‘Family’ films that are rated ‘G’ and are less than 2 hours in length
-- (3 rows)

SELECT film.title FROM film
JOIN film_category ON film_category.film_id = film.film_id
JOIN category ON film_category.category_id = category.category_id
WHERE category.name = 'Family' AND film.rating = 'G' AND length < 120;

-- 8. All of the films featuring actor Matthew Leigh that are rated ‘G’
-- (9 rows)

SELECT film.title  FROM film
JOIN film_actor ON film_actor.film_id = film.film_id
JOIN actor ON film_actor.actor_id = actor.actor_id
WHERE actor.last_name = 'LEIGH' AND film.rating = 'G';

-- 9. All of the ‘Sci-Fi’ films released in 2006
-- (61 rows)

SELECT film.title FROM film
JOIN film_category ON film_category.film_id = film.film_id
JOIN category ON film_category.category_id = category.category_id
WHERE category.name = 'Sci-Fi' AND film.release_year = 2006;

-- 10. All of the ‘Action’ films starring Nick Stallone
-- (2 rows)

SELECT film.title  FROM film
JOIN film_actor ON film_actor.film_id = film.film_id
JOIN actor ON film_actor.actor_id = actor.actor_id
JOIN film_category ON film_category.film_id = film.film_id
JOIN category ON film_category.category_id = category.category_id
WHERE actor.last_name = 'STALLONE' AND category.name = 'Action';


-- 11. The address of all stores, including street address, city, district, and country
-- (2 rows)

SELECT (address.address, city.city, address.district, country.country) AS "Store Address" FROM store
JOIN address ON store.store_id = address.address_id
JOIN city ON city.city_id = address.city_id
JOIN country ON country.country_id = city.country_id;

-- 12. A list of all stores by ID, the store’s street address, and the name of the store’s manager
-- (2 rows)

SELECT store.store_id, address.address, staff.first_name, staff.last_name FROM store
JOIN address ON store.address_id = address.address_id
JOIN staff ON store.manager_staff_id = staff.staff_id;


-- 13. The first and last name of the top ten customers ranked by number of rentals 
-- (#1 should be “ELEANOR HUNT” with 46 rentals, #10 should have 39 rentals)

SELECT customer.first_name, customer.last_name, count(rental.rental_id) AS rental_count FROM customer
JOIN rental ON customer.customer_id = rental.customer_id
GROUP BY customer.first_name, customer.last_name
ORDER BY rental_count DESC
LIMIT 10;


-- 14. The first and last name of the top ten customers ranked by dollars spent 
-- (#1 should be “KARL SEAL” with 221.55 spent, #10 should be “ANA BRADLEY” with 174.66 spent)

SELECT (customer.first_name, customer.last_name) AS customer_full, SUM(payment.amount) AS total FROM customer
JOIN rental ON rental.customer_id = customer.customer_id
JOIN payment ON rental.rental_id = payment.rental_id
GROUP BY customer_full
ORDER BY total DESC
LIMIT 10;


-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store 
-- (Store 1 has 7928 total rentals and Store 2 has 8121 total rentals)


SELECT store.store_id, address.address, COUNT (rental.rental_id) AS total_rentals, round(AVG(payment.amount),2)  AS avgsales, SUM(payment.amount) AS totalsales
FROM store
JOIN address ON store.address_id = address.address_id
JOIN customer ON customer.store_id = store.store_id
JOIN rental ON rental.customer_id = customer.customer_id
JOIN payment ON rental.rental_id = payment.rental_id
GROUP BY store.store_id, address.address
ORDER BY store.store_id ASC;

-- 16. The top ten film titles by number of rentals
-- (#1 should be “BUCKET BROTHERHOOD” with 34 rentals and #10 should have 31 rentals)

SELECT film.title, COUNT(rental.rental_id) as rental_count
FROM film
JOIN inventory ON film.film_id = inventory.film_id
JOIN rental ON inventory.inventory_id = rental.inventory_id
GROUP BY film.title
ORDER BY rental_count DESC
LIMIT 10;




-- 17. The top five film categories by number of rentals 
-- (#1 should be “Sports” with 1179 rentals and #5 should be “Family” with 1096 rentals)

SELECT category.name, count(rental.rental_id) as rental_count
FROM film
JOIN inventory ON film.film_id = inventory.film_id
JOIN rental ON inventory.inventory_id = rental.inventory_id
JOIN film_category ON film.film_id = film_category.film_id
JOIN category ON film_category.category_id = category.category_id
GROUP BY category.name
ORDER BY rental_count DESC
LIMIT 5;


-- 18. The top five Action film titles by number of rentals 
-- (#1 should have 30 rentals and #5 should have 28 rentals)

SELECT film.title, COUNT(rental.rental_id) as rental_count
FROM film
JOIN film_category ON film.film_id = film_category.film_id
JOIN category ON category.category_id = film_category.category_id
JOIN inventory ON film.film_id = inventory.film_id
JOIN rental ON inventory.inventory_id = rental.inventory_id
WHERE category.name = 'Action'
GROUP BY film.title
ORDER BY rental_count DESC
LIMIT 5;



-- 19. The top 10 actors ranked by number of rentals of films starring that actor 
-- top person is actually Susan Davis with 825 rentals and the tenth person is Sandra Kilmer with 604

SELECT (actor.first_name || ' ' || actor.last_name) AS actor_fullname, COUNT(rental.rental_id) as rental_count
FROM film
JOIN film_actor ON film.film_id = film_actor.film_id
JOIN actor ON film_actor.actor_id = actor.actor_id
JOIN inventory ON film.film_id = inventory.film_id
JOIN rental ON inventory.inventory_id = rental.inventory_id
GROUP BY actor_fullname
ORDER BY rental_count DESC
LIMIT 10;

-- 20. The top 5 “Comedy” actors ranked by number of rentals of films in the “Comedy” category starring that actor 
-- (#1 should have 87 rentals and #5 should have 72 rentals)

SELECT (actor.first_name || ' ' || actor.last_name) AS actor_fullname, COUNT(rental.rental_id) as rental_count
FROM film
JOIN film_actor ON film.film_id = film_actor.film_id
JOIN actor ON film_actor.actor_id = actor.actor_id
JOIN inventory ON film.film_id = inventory.film_id
JOIN rental ON inventory.inventory_id = rental.inventory_id
JOIN film_category ON film.film_id = film_category.film_id
JOIN category ON category.category_id = film_category.category_id
WHERE category.name = 'Comedy'

GROUP BY actor_fullname
ORDER BY rental_count DESC
LIMIT 5;
