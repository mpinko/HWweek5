package edu.gcccd.csis;

public class Organization {
    //instance fields
    protected String orgName;
    protected int numEmployees;

    //constructors
    public Organization(String orgName, int numEmployees)
    {
        this.orgName = orgName;
        this.numEmployees = numEmployees;
    }
    public Organization(String orgName)
    {
        this(orgName, 0000);
    }
    public Organization()
    {
        this("Unknown", 0000);
    }

    //setters
    public void setOrgName(String orgName)
    {
        this.orgName = orgName;
    }
    public void setNumEmployees(int numEmployees)
    {
        this.numEmployees = numEmployees;
    }

    //getters
    public String getOrgName()
    {
        return orgName;
    }
    public int getNumEmployees()
    {
        return numEmployees;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Organization)
        {
            Organization x = (Organization)obj;
            return this.orgName.equals(x.orgName);
        }
        return false;
    }
}