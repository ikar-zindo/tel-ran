package de.telran.g_280323_m_be_test.test;

public class ProductionChief {

   private Worker worker;
   private MaterialStorage materialStorage;
   private ProductionStorage productionStorage;

   public Worker getWorker() {
      return worker;
   }

   public void setWorker(Worker worker) {
      this.worker = worker;
   }

   public MaterialStorage getMaterialStorage() {
      return materialStorage;
   }

   public void setMaterialStorage(MaterialStorage materialStorage) {
      this.materialStorage = materialStorage;
   }

   public ProductionStorage getProductionStorage() {
      return productionStorage;
   }

   public void setProductionStorage(ProductionStorage productionStorage) {
      this.productionStorage = productionStorage;
   }
}
