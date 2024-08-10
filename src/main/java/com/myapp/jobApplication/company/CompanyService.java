package com.myapp.jobApplication.company;

import java.util.List;

public interface CompanyService {

    //get all the companies
    List<Company> getAllCompanies();
    boolean updateCompany(Company company, Long id);
    void createCompany(Company company);
    boolean deleteCompanyById(Long id);
    Company getCompanyById(Long id);
}
