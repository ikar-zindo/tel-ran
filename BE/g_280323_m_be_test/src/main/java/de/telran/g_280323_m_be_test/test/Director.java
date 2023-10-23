package de.telran.g_280323_m_be_test.test;

public class Director {

   private ProductionChief productionChief;
   private SalesChief salesChief;

   public ProductionChief getProductionChief() {
      return productionChief;
   }

   public void setProductionChief(ProductionChief productionChief) {
      this.productionChief = productionChief;
   }

   public SalesChief getSalesChief() {
      return salesChief;
   }

   public void setSalesChief(SalesChief salesChief) {
      this.salesChief = salesChief;
   }
}
