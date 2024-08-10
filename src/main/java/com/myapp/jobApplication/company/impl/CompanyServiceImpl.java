package com.myapp.jobApplication.company.impl;

import com.myapp.jobApplication.company.Company;
import com.myapp.jobApplication.company.CompanyRepository;
import com.myapp.jobApplication.company.CompanyService;
import com.myapp.jobApplication.job.Job;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {
    private CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public boolean updateCompany(Company company, Long id) {
        Optional<Company> companyOptional = companyRepository.findById(id);
        if(companyOptional.isPresent()){
            Company updatedCompany = companyOptional.get();
            updatedCompany.setName(company.getName());
            updatedCompany.setDescription(company.getDescription());
            updatedCompany.setJobs(company.getJobs());
            companyRepository.save(updatedCompany);
            return true;
        }
        return false;
    }

    @Override
    public void createCompany(Company company) {
        companyRepository.save(company);
    }

    @Override
    public boolean deleteCompanyById(Long id) {
        if(companyRepository.existsById(id)){
            companyRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Company getCompanyById(Long id) {
        return companyRepository.findById(id).orElse(null);
    }


}
