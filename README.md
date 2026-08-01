# hibernateLearning

A small practice project for learning Hibernate ORM basics with PostgreSQL —
mapping a Java class to a database table and persisting records using
Hibernate's `Session` and `Transaction` API.

## Tech stack

- Java
- Hibernate ORM
- PostgreSQL
- Maven

## What it covers

- Defining an entity with `@Entity` and `@Id` (`Employee`)
- Configuring Hibernate via `hibernate.cfg.xml`
- Building a `SessionFactory` and opening a `Session`
- Persisting an object with `session.persist()` inside a `Transaction`

## Setup

1. Create a PostgreSQL database matching the one in `hibernate.cfg.xml`
   (default: `tryHibernate`).

2. Update `src/main/resources/hibernate.cfg.xml` with your own DB
   username/password:

   ```xml
   <property name="hibernate.connection.url">jdbc:postgresql://localhost:5432/tryHibernate</property>
   <property name="hibernate.connection.username">YOUR_USERNAME</property>
   <property name="hibernate.connection.password">YOUR_PASSWORD</property>
   ```

   > **Don't commit real credentials.** Keep this file out of version control
   > or externalize the values before pushing.

3. Run `Main.java` — it persists a sample `Employee` record to the database.

## Notes

This is a learning/practice project focused on Hibernate fundamentals, not a
full application.
