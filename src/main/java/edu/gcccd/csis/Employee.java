package edu.gcccd.csis;

public class Employee {

    //instance fields
    protected String name;
    protected String jobTitle;
    protected String orgWorkingFor;
    protected double birthday;

    //constructors
    public Employee(String name, String jobTitle, String orgWorkingFor, double birthday)
    {
        this.name = name;
        this.jobTitle = jobTitle;
        this.orgWorkingFor = orgWorkingFor;
        this.birthday = birthday;
    }
    public Employee(String name, String orgWorkingFor, double birthday)
    {
        this(name, null, orgWorkingFor, birthday);
    }
    public Employee()
    {
        this(null, null, null, 00000000);
    }

    //setters
    public void setName(String name)
    {
        this.name = name;
    }
    public void setJobTitle(String jobTitle)
    {
        this.jobTitle = jobTitle;
    }
    public void setOrgWorkingFor(String orgWorkingFor)
    {
        this.orgWorkingFor = orgWorkingFor;
    }
    public void setBirthday(double birthday)
    {
        this.birthday = birthday;
    }

    //getters
    public String getName()
    {
        return name;
    }
    public String getJobTitle()
    {
        return jobTitle;
    }
    public String getOrgWorkingFor()
    {
        return orgWorkingFor;
    }
    public double getBirthday()
    {
        return birthday;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof Employee)
        {
            Employee x = (Employee)obj;
            return this.name.equals(x.name) && this.orgWorkingFor.equals(x.orgWorkingFor) && this.birthday==x.birthday;
        }
        return false;
    }
}
