package beans;

import dao.impl.CompanyDAOimpl;
import dao.interfaces.CompanyDAO;
import enteties.Company;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import java.util.List;

@ManagedBean(name = "companyBean")
public class CompanyBean /*implements Converter*/{

    @ManagedProperty(value = "#{company}")
    private Company company = new Company();

    private CompanyDAO companyDAO = new CompanyDAOimpl();

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Company> findAllCompanies() {
        List companies = companyDAO.findAllCompanies();
        return companies;
    }

    public void create(Company company) {
        companyDAO.create(company);
    }

    public void update(int id, Company company) {
        companyDAO.update(id, company);
    }

    public void delete(int companyID) {
        companyDAO.delete(companyID);
    }


}
