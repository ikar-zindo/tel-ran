package de.telran.g_280323_m_be_shop.repository.mysql;

public class MySqlCustomerRepository {

   String query = "select * from customer as c " +
           "left join customer_product as cp on c.customer_id = cp.customer_id " +
           "left join product as p on cp.product_id=p.product_id";
}
