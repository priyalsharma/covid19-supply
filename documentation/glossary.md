Entity: <br/>
1.	Hospital: <br/>
      Synonym: medical center <br/>
      Description: The hospital entity represents the table that contains details of hospitals that can order the product stock <br/>
2.	Customer: <br/>
      Synonym: Buyer/Consumer <br/>
      Description: The customer entity represents the table that contains details of customers that can order the product stock. <br/>
3.	Product_stock: <br/>
      Synonym: Goods, Commodities <br/>
      Description: The Product_stock entity represents the table that contains details of stocks that are supplied to the hospital and the customer. <br/>
4.	Supplier: <br/>
      Synonym: seller, provider <br/>
      Description: The supplier entity represents the table that contains details of suppliers that manage the delivery staff and also arrange for the product stock that could be supplied to the hospital and customers. <br/>
5.	Delivery_staff: <br/>
Synonym: transporter <br/>
   Description: The delivery_staff entity represents the table that contains details of transporters that deliver the ordered product stock to the hospital and customers. <br/>
<br/>
Entity Relationship: <br/>
hospital places_order product_stock :  maxima: one-many minima: zero-zero <br/>
customer orders product_stock: maxima: one-many minima: zero-zero <br/>
supplier supplies product_stock: maxima: one-many minima: one-one <br/>
delivery_staff delivers_to_customer customer: maxima: one-many minima: zero-zero <br/>
delivery_staff delivers_to_hospital hospital: maxima: one-many minima: zero-zero <br/>
supplier manages delivery_staff: maxima: one-many minima: one-one <br/>
<br/>
Attribute maxima & minima : <br/>
Entity hospital: <br/> 
hospital_id : Each hospital_id is assigned to one hospital. Each hospital has one hospital_id and it is required <br/>
hospital_name : Each hospital has one hospital_name(singular) and it is required. Many hospitals can have same name(not unique) <br/>
hospital_address : Each hospital has hospital_address. It is unique and required for delivery of products <br/>
product_name : Each product has one product_name.  Each product_name is assigned to one product and it is required <br/>
product_quantity: product_quantity is not unique but singular. At least one product needs to be ordered <br/>
product_id : Each product_id is assigned to one product. Each product has one product_id and it is required <br/>
<br/>
Entity customer: <br/>
customer_id : Each customer_id is assigned to one customer. Each customer has one customer_id and it is required <br/>
customer_name : Each customer has one customer_name(singular) and it is required. Many customers can have same name(not unique) <br/>
customer_address : Each customer has customer_address. It is unique and required for delivery of products <br/>
customer_age: It is not unique but singular and optional <br/>
product_quantity: product_quantity is not unique but singular. At least one product needs to be ordered <br/>
product_name : Each product has one product_name.  Each product_name is assigned to one product and it is required <br/>
product_id : Each product_id is assigned to one product. Each product has one product_id and it is required <br/>
<br/>
Entity product_stock: <br/>
product_name : Each product has one product_name.  Each product_name is assigned to one product and it is required <br/>
product_id : Each product_id is assigned to one product. Each product has one product_id and it is required <br/>
supplier_id: Each supplier_id is assigned to one hospital. Each supplier has one supplier_id and it is required <br/>
<br/>
Enitiy supplier: <br/>
supplier_id: Each supplier_id is assigned to one hospital. Each supplier has one supplier_id and it is required <br/>
supplier_name : Each supplier has one supplier_name(singular) and it is required. Many suppliers can have same name(not unique) <br/>
product_count : Supplier stores the details of that product left in stock. product_count is not unique but singular. The required quantity must be present in stock to place delivery <br/>
delivery_id : Each delivery_id is assigned to one delivery package. Each delivery package has one delivery_id and it is required <br/>
delivery_staff_id : Each delivery_staff_id is assigned to one delivery agent. Each delivery agent has one delivery_staff_id and it is required <br/>
<br/>
Enitiy delivery_staff: <br/>
delivery_staff_id : Each delivery_staff_id is assigned to one delivery agent. Each delivery agent has one delivery_staff_id and it is required <br/>
hospital_id : Each hospital_id is assigned to one hospital. Each hospital has one hospital_id and it is required to make delivery to correct hosplital <br/>
customer_id : Each customer_id is assigned to one customer. Each customer has one customer_id and it is required  to make delivery to correct customer<br/>
delivery_id : Each delivery_id is assigned to one delivery package. Each delivery package has one delivery_id and it is required <br/>
delivery_date : Each delivery has one date(singular) on which it needs to be delivered and it is required. Many deliveries can have same delivery_date (not unique) <br/>
