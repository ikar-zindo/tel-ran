package de.telran.g_280323_m_be_test.test;

public class Main {
   public static void main(String[] args) {

      ProductionStorage productionStorage = new ProductionStorage();
      MaterialStorage materialStorage = new MaterialStorage();

      SalesManager salesManager = new SalesManager();
      Worker worker = new Worker();

      ProductionChief productionChief = new ProductionChief();
      SalesChief salesChief = new SalesChief();

      Director director = new Director();

      ProductionDepartment productionDepartment = new ProductionDepartment();
      SalesDepartment salesDepartment = new SalesDepartment();


      director.setProductionChief(productionChief);
      director.setSalesChief(salesChief);

      productionChief.setProductionStorage(productionStorage);
      productionChief.setWorker(worker);
      productionChief.setProductionStorage(productionStorage);

      salesChief.setSalesManager(salesManager);
      salesChief.setProductionStorage(productionStorage);
   }
}
