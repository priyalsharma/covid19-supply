## Table of Contents
1. [Database](#database)
1. [Author(s)](#author)
1. [Database description](#description)

# Database
covid19_supply

# Author(s)
1.Priyal Manish Sharma <br/>
2.Vineeth Myneedi


# Database description
It is essential to have a software application that can help us to manage the COVID-19 supplies and ensure adequate distribution to the people in need. <br/>
Our database system contains five entities: <br/>
hospital: List of hospitals that make the request of supplies <br/>
customer: List of customers that make the request of supplies <br/>
product: List of products that can be ordered <br/>
supplier: List of suppliers that supply the products or manage them <br/>
delivery_staff: List of individuals who deliver the supplies <br/>
Our database system will play a key role in capturing the snapshot of supply chain of essential covid-19 products by storing the data of various entities involved. This data can be further used in the applications to assess the availability of stock and transit time of supply during an hour of emergency. The important feature of this project is that it’s implementation is towards the goal that it only stores the data related to the covid-19 supplements. This is a small subset and hence would be faster as compared to general health supply systems. The database would act as a backend and a Java GUI published on a web server will act as the query search engine. We can have a master login for the web page for updating the database.

#COVID-19 Supply
This project aims to create a platform for tracking and managing the distribution of COVID-19 related supplies such as masks, ventilators, and PPE. The platform allows hospitals and other organizations to request supplies, and suppliers to fulfill those requests.

##Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

##Prerequisites
Java EE Servlets
Core Java
MySQL
HTML

##Installing
Clone the repository:
Copy code
git clone https://github.com/priyalsharma/covid19-supply.git
Install the dependencies:
Copy code
npm install
Start the development server:
Copy code
npm start
Open http://localhost:3000 to view the application in the browser.
Running the tests
This project uses Jest for testing. You can run the tests by running the following command:

Copy code
npm test

##Deployment
The application can be deployed on a live system by creating a production build and running it on a server. The process for creating a production build and deploying the application may vary depending on the hosting platform.

##Built With
Java EE - Web Servlets
MySQL - Database
JSP (HTML) - Web framework
Java - Web Application

##Authors
Priyal Sharma
Vineeth Myneedi
