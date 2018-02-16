-- Write queries to return the following:
-- The following changes are applied to the "pagila" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.

--SELECT * from actor;

INSERT INTO actor (actor_id, first_name, last_name) VALUES (201,'HAMPTON', 'AVENUE')
INSERT INTO actor (actor_id, first_name, last_name) VALUES (202,'LISA', 'BYWAY')

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece", to the film table. The movie was released in 2008 in English. 
-- Since its an epic, the run length is 3hrs and 18mins. There are no special 
-- features, the film speaks for itself, and doesn't need any gimmicks.	

INSERT INTO film (film_id, title, description, release_year, language_id, original_language_id, rental_duration, rental_rate, length, replacement_cost, rating) 
VALUES (1001,'Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', 2008, 1, null, 3, 2.99, 198, 11.99, 'PG')


-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly 
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.


BEGIN TRANSACTION;
INSERT INTO film_actor (actor_id, film_id)
VALUES (201, 1001);
INSERT INTO film_actor (actor_id, film_id)
VALUES (202, 1001);
COMMIT;
ROLLBACK;

-- 4. Add Mathmagical to the category table.


BEGIN TRANSACTION;
INSERT INTO category (category_id, name)
VALUES (17, 'Mathmagical');
COMMIT;
ROLLBACK;

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI", 
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"

BEGIN TRANSACTION;
INSERT INTO film_category (category_id, film_id)
VALUES (17, 1001);
INSERT INTO film_category (category_id, film_id)
VALUES (17, 274);
INSERT INTO film_category (category_id, film_id)
VALUES (17, 494);
INSERT INTO film_category (category_id, film_id)
VALUES (17, 714);
INSERT INTO film_category (category_id, film_id)
VALUES (17, 996);

COMMIT;
ROLLBACK;

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films 
-- accordingly.
-- (5 rows affected)

BEGIN TRANSACTION;
UPDATE film
SET rating = 'G'
FROM film_category
WHERE film_category.film_id = film.film_id
AND film_category.category_id = 17


COMMIT;
ROLLBACK;

-- 7. Add a copy of "Euclidean PI" to all the stores.

BEGIN TRANSACTION;
INSERT INTO inventory (film_id, inventory_id, store_id)
VALUES (1001, 4582, 1);

INSERT INTO inventory (film_id, inventory_id, store_id)
VALUES (1001, 4583, 2);

COMMIT;
ROLLBACK;


-- 8. The Feds have stepped in and have impounded all copies of the pirated film, 
-- "Euclidean PI". The film has been seized from all stores, and needs to be 
-- deleted from the film table. Delete "Euclidean PI" from the film table. 
-- (Did it succeed? Why?)

No, violates foreign key constraint "film_actor_film_id_fkey"


-- 9. Delete Mathmagical from the category table. 
-- (Did it succeed? Why?)

No, violates foreign key constraint "film_category_category_id_fkey" is still referenced from table "film_category"

-- 10. Delete all links to Mathmagical in the film_category tale. 
-- (Did it succeed? Why?)
Yes, because it is the table source table for film categories




-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI". 
-- (Did either deletes succeed? Why?)

BEGIN TRANSACTION;
DELETE FROM category
WHERE category_id = 17

COMMIT;
ROLLBACK;

Yes, no longer has a foreign key constraint 

BEGIN TRANSACTION;
DELETE FROM film
WHERE film_id = 1001

COMMIT;
ROLLBACK;

No, violates foreign key constraint "film_actor_film_id_fkey"  is still referenced from table "film_actor".



-- 12. Check database metadata to determine all constraints of the film id, and 
-- describe any remaining adjustments needed before the film "Euclidean PI" can 
-- be removed from the film table.

Delete film id from film actor since it's still linkked as a foreign key

