# Assignment: A database for the Currency Converter application

In submodule 6.2., you designed an application for the currency converter that had a graphical user interface. In this assignment, the goal is to design a database for the application. Later, we will make the application use the database.

The Model of the application contains the `Currency` class, which stores for each currency the following data: the abbreviation, name, and conversion rate to a fixed currency (e.g., USD). In addition, you need to store the list of currencies somewhere, either in a Model class or in the Controller class.

Now, design a database that stores the data of the `Currency` objects. Make a database script that contains the following things:

1. A statement for dropping the previous version of the database, if it exists.
2. A statement for creating the database.
3. A statement for creating a table for storing the `Currency` objects.
4. Statements for populating the table with data. You should include at least eight currencies with up-to-date exchange rates in the table.
5. A statement for dropping the user account `appuser`, if it exists.
6. A statement for creating the user account `appuser`.
7. Statements for granting the privileges to the user account `appuser`. Think of your application: what privileges does it need? The user account should have only the privileges it needs, and no more.

Save the database script and run it to create the MariaDB database. Verify that it works, even if you run it more than once.

Once the database is established, write the following SQL queries to test it:
1. A query that retrieves all the currencies from the database.
2. A query that retrieves the currency with the abbreviation `EUR` (or other abbreviation, if you don't have EUR in your database).
3. A query that retrieves the number of currencies in the database.
4. A query that retrieves the currency with the highest exchange rate.

Do not include the queries in the database script. Instead, write them in a separate file, e.g., `queries.sql`. You can run the queries either from HeidiSQL or from the command line with the command `mysql -u root -p < queries.sql`.

For this assignment, you get points as follows:
- The script contains the statements 1-4. (1 point)
- The script contains the statements 5-6. (1 point)
- The script contains the statement 7. (1 point)
- The script works correctly and can be run multiple times. (1 point)
- The queries 1-2 work correctly. (1 point)
- The queries 3-4 work correctly. (1 point)