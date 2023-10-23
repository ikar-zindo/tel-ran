package de.telran.g_280323_m_be_test.test;

public class SalesChief {

   private SalesManager salesManager;
   private ProductionStorage productionStorage;

   public SalesManager getSalesManager() {
      return salesManager;
   }

   public void setSalesManager(SalesManager salesManager) {
      this.salesManager = salesManager;
   }

   public ProductionStorage getProductionStorage() {
      return productionStorage;
   }

   public void setProductionStorage(ProductionStorage productionStorage) {
      this.productionStorage = productionStorage;
   }
}
