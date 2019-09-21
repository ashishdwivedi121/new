package jquery.datatables.model;

import java.util.LinkedList;
import java.util.List;

public class DataRepository {
	
	/// <summary>
    /// Singleton collection of companies
    /// </summary>
    private static List<Company> CompanyData = null;

    /// <summary>
    /// Method that returns all companies used in this example
    /// </summary>
    /// <returns>List of companies</returns>
    public static List<Company> GetCompanies()
    {
        if (CompanyData == null)
        {
            CompanyData = new LinkedList<Company>();
            CompanyData.add(new Company("DAE","POS", "ULPD", "ECOM1234", "Success","09-21-2019:12:01","09-21-2019:12:05" ));
            CompanyData.add(new Company("DAE","POS","UPOS", "POS9945", "Success","09-20-2019:2:00","09-20-2019:2:10" ));
            CompanyData.add(new Company("DAE","Profitect", "UPROP", "ECOM12", "Success","09-22-2019:3:10","09-22-2019:3:45" ));
            CompanyData.add(new Company("CF","Asset Protection", "ULPDE","LPD189", "Success","09-21-2019:4:10","09-21-2019:4:20" ));
            CompanyData.add(new Company("FA","PARS", "PARH","HDP3884", "Failed","09-24-2019:4:50","09-24-2019:4:55" ));
            CompanyData.add(new Company("WAM","ECOM", "COME", "FGU782", "Success","09-21-2019:9:10","09-21-2019:9:14"));
          
            CompanyData.add(new Company("DAE","POS", "ULPD", "ECOM1234", "Success","09-21-2019:12:01","09-21-2019:12:05" ));
            CompanyData.add(new Company("DAE","POS","UPOS", "POS9945", "Success","09-20-2019:2:00","09-20-2019:2:10" ));
            CompanyData.add(new Company("DAE","Profitect", "UPROP", "ECOM12", "Success","09-22-2019:3:10","09-22-2019:3:45" ));
            CompanyData.add(new Company("CF","Asset Protection", "ULPDE","LPD189", "Success","09-21-2019:4:10","09-21-2019:4:20" ));
            CompanyData.add(new Company("FA","PARS", "PARH","HDP3884", "Failed","09-24-2019:4:50","09-24-2019:4:55" ));
            CompanyData.add(new Company("WAM","ECOM", "COME", "FGU782", "Success","09-21-2019:9:10","09-21-2019:9:14"));
          
            CompanyData.add(new Company("DAE","POS", "ULPD", "ECOM1234", "Success","09-21-2019:12:01","09-21-2019:12:05" ));
            CompanyData.add(new Company("DAE","POS","UPOS", "POS9945", "Success","09-20-2019:2:00","09-20-2019:2:10" ));
            CompanyData.add(new Company("DAE","Profitect", "UPROP", "ECOM12", "Success","09-22-2019:3:10","09-22-2019:3:45" ));
            CompanyData.add(new Company("CF","Asset Protection", "ULPDE","LPD189", "Success","09-21-2019:4:10","09-21-2019:4:20" ));
            CompanyData.add(new Company("FA","PARS", "PARH","HDP3884", "Failed","09-24-2019:4:50","09-24-2019:4:55" ));
            CompanyData.add(new Company("WAM","ECOM", "COME", "FGU782", "Success","09-21-2019:9:10","09-21-2019:9:14"));
          
            CompanyData.add(new Company("DAE","POS", "ULPD", "ECOM1234", "Success","09-21-2019:12:01","09-21-2019:12:05" ));
            CompanyData.add(new Company("DAE","POS","UPOS", "POS9945", "Success","09-20-2019:2:00","09-20-2019:2:10" ));
            CompanyData.add(new Company("DAE","Profitect", "UPROP", "ECOM12", "Success","09-22-2019:3:10","09-22-2019:3:45" ));
            CompanyData.add(new Company("CF","Asset Protection", "ULPDE","LPD189", "Success","09-21-2019:4:10","09-21-2019:4:20" ));
            CompanyData.add(new Company("FA","PARS", "PARH","HDP3884", "Failed","09-24-2019:4:50","09-24-2019:4:55" ));
            CompanyData.add(new Company("WAM","ECOM", "COME", "FGU782", "Success","09-21-2019:9:10","09-21-2019:9:14"));
          
            CompanyData.add(new Company("DAE","POS", "ULPD", "ECOM1234", "Success","09-21-2019:12:01","09-21-2019:12:05" ));
            CompanyData.add(new Company("DAE","POS","UPOS", "POS9945", "Success","09-20-2019:2:00","09-20-2019:2:10" ));
            CompanyData.add(new Company("DAE","Profitect", "UPROP", "ECOM12", "Success","09-22-2019:3:10","09-22-2019:3:45" ));
            CompanyData.add(new Company("CF","Asset Protection", "ULPDE","LPD189", "Success","09-21-2019:4:10","09-21-2019:4:20" ));
            CompanyData.add(new Company("FA","PARS", "PARH","HDP3884", "Failed","09-24-2019:4:50","09-24-2019:4:55" ));
            CompanyData.add(new Company("WAM","ECOM", "COME", "FGU782", "Success","09-21-2019:9:10","09-21-2019:9:14"));
          
            CompanyData.add(new Company("DAE","POS", "ULPD", "ECOM1234", "Success","09-21-2019:12:01","09-21-2019:12:05" ));
            CompanyData.add(new Company("DAE","POS","UPOS", "POS9945", "Success","09-20-2019:2:00","09-20-2019:2:10" ));
            CompanyData.add(new Company("DAE","Profitect", "UPROP", "ECOM12", "Success","09-22-2019:3:10","09-22-2019:3:45" ));
            CompanyData.add(new Company("CF","Asset Protection", "ULPDE","LPD189", "Success","09-21-2019:4:10","09-21-2019:4:20" ));
            CompanyData.add(new Company("FA","PARS", "PARH","HDP3884", "Failed","09-24-2019:4:50","09-24-2019:4:55" ));
            CompanyData.add(new Company("WAM","ECOM", "COME", "FGU782", "Success","09-21-2019:9:10","09-21-2019:9:14"));
          
            CompanyData.add(new Company("DAE","POS", "ULPD", "ECOM1234", "Success","09-21-2019:12:01","09-21-2019:12:05" ));
            CompanyData.add(new Company("DAE","POS","UPOS", "POS9945", "Success","09-20-2019:2:00","09-20-2019:2:10" ));
            CompanyData.add(new Company("DAE","Profitect", "UPROP", "ECOM12", "Success","09-22-2019:3:10","09-22-2019:3:45" ));
            CompanyData.add(new Company("CF","Asset Protection", "ULPDE","LPD189", "Success","09-21-2019:4:10","09-21-2019:4:20" ));
            CompanyData.add(new Company("FA","PARS", "PARH","HDP3884", "Failed","09-24-2019:4:50","09-24-2019:4:55" ));
            CompanyData.add(new Company("WAM","ECOM", "COME", "FGU782", "Success","09-21-2019:9:10","09-21-2019:9:14"));
          
            CompanyData.add(new Company("DAE","POS", "ULPD", "ECOM1234", "Success","09-21-2019:12:01","09-21-2019:12:05" ));
            CompanyData.add(new Company("DAE","POS","UPOS", "POS9945", "Success","09-20-2019:2:00","09-20-2019:2:10" ));
            CompanyData.add(new Company("DAE","Profitect", "UPROP", "ECOM12", "Success","09-22-2019:3:10","09-22-2019:3:45" ));
            CompanyData.add(new Company("CF","Asset Protection", "ULPDE","LPD189", "Success","09-21-2019:4:10","09-21-2019:4:20" ));
            CompanyData.add(new Company("FA","PARS", "PARH","HDP3884", "Failed","09-24-2019:4:50","09-24-2019:4:55" ));
            CompanyData.add(new Company("WAM","ECOM", "COME", "FGU782", "Success","09-21-2019:9:10","09-21-2019:9:14"));
          
            CompanyData.add(new Company("DAE","POS", "ULPD", "ECOM1234", "Success","09-21-2019:12:01","09-21-2019:12:05" ));
            CompanyData.add(new Company("DAE","POS","UPOS", "POS9945", "Success","09-20-2019:2:00","09-20-2019:2:10" ));
            CompanyData.add(new Company("DAE","Profitect", "UPROP", "ECOM12", "Success","09-22-2019:3:10","09-22-2019:3:45" ));
            CompanyData.add(new Company("CF","Asset Protection", "ULPDE","LPD189", "Success","09-21-2019:4:10","09-21-2019:4:20" ));
            CompanyData.add(new Company("FA","PARS", "PARH","HDP3884", "Failed","09-24-2019:4:50","09-24-2019:4:55" ));
            CompanyData.add(new Company("WAM","ECOM", "COME", "FGU782", "Success","09-21-2019:9:10","09-21-2019:9:14"));
          
            CompanyData.add(new Company("DAE","POS", "ULPD", "ECOM1234", "Success","09-21-2019:12:01","09-21-2019:12:05" ));
            CompanyData.add(new Company("DAE","POS","UPOS", "POS9945", "Success","09-20-2019:2:00","09-20-2019:2:10" ));
            CompanyData.add(new Company("DAE","Profitect", "UPROP", "ECOM12", "Success","09-22-2019:3:10","09-22-2019:3:45" ));
            CompanyData.add(new Company("CF","Asset Protection", "ULPDE","LPD189", "Success","09-21-2019:4:10","09-21-2019:4:20" ));
            CompanyData.add(new Company("FA","PARS", "PARH","HDP3884", "Failed","09-24-2019:4:50","09-24-2019:4:55" ));
            CompanyData.add(new Company("WAM","ECOM", "COME", "FGU782", "Success","09-21-2019:9:10","09-21-2019:9:14"));
          
            CompanyData.add(new Company("DAE","POS", "ULPD", "ECOM1234", "Success","09-21-2019:12:01","09-21-2019:12:05" ));
            CompanyData.add(new Company("DAE","POS","UPOS", "POS9945", "Success","09-20-2019:2:00","09-20-2019:2:10" ));
            CompanyData.add(new Company("DAE","Profitect", "UPROP", "ECOM12", "Success","09-22-2019:3:10","09-22-2019:3:45" ));
            CompanyData.add(new Company("CF","Asset Protection", "ULPDE","LPD189", "Success","09-21-2019:4:10","09-21-2019:4:20" ));
            CompanyData.add(new Company("FA","PARS", "PARH","HDP3884", "Failed","09-24-2019:4:50","09-24-2019:4:55" ));
            CompanyData.add(new Company("WAM","ECOM", "COME", "FGU782", "Success","09-21-2019:9:10","09-21-2019:9:14"));
          
            CompanyData.add(new Company("DAE","POS", "ULPD", "ECOM1234", "Success","09-21-2019:12:01","09-21-2019:12:05" ));
            CompanyData.add(new Company("DAE","POS","UPOS", "POS9945", "Success","09-20-2019:2:00","09-20-2019:2:10" ));
            CompanyData.add(new Company("DAE","Profitect", "UPROP", "ECOM12", "Success","09-22-2019:3:10","09-22-2019:3:45" ));
            CompanyData.add(new Company("CF","Asset Protection", "ULPDE","LPD189", "Success","09-21-2019:4:10","09-21-2019:4:20" ));
            CompanyData.add(new Company("FA","PARS", "PARH","HDP3884", "Failed","09-24-2019:4:50","09-24-2019:4:55" ));
            CompanyData.add(new Company("WAM","ECOM", "COME", "FGU782", "Success","09-21-2019:9:10","09-21-2019:9:14"));
          
            
            
            
            
          
        }
        return CompanyData;
    }

}
