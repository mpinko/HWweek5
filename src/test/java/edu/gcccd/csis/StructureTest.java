package edu.gcccd.csis;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class StructureTest {

    private Employee e1;
    private Organization c1;

    @Before
    public void setUp()
    {
        Employee x = new Employee("Joe", "Programmer", "Google", 05151995D);
        e1 = x;
        Organization y = new Organization("Google", 1000);
        c1 = y;
    }

    @Test
    public void employeeComplete()
    {
        assertEquals(e1.getName(), "Joe");
        assertEquals(e1.getJobTitle(), "Programmer");
        assertEquals(e1.getOrgWorkingFor(), "Google");
        assertTrue(e1.getBirthday() == 05151995D);

        assertTrue(e1.getBirthday() > 05151920D);
        assertTrue(e1.getBirthday() < 05152004D);
    }

    /**
     * Check Employee Equality
     */
    @Test
    public void employeeEq()
    {
        Employee e2 = new Employee();

        assertNull(e2.getName());
        assertNull(e2.getJobTitle());
        assertNull(e2.getOrgWorkingFor());
        assertTrue(e2.getBirthday() == 0);

        e2.setName("Joe");
        e2.setJobTitle("Marketing Analyst");
        e2.setOrgWorkingFor("Google");
        e2.setBirthday(05151995D);

        assertEquals(e1, e2);

        e2.setOrgWorkingFor("Amazon");
        assertNotEquals(e1, e2);
    }

    /**
     * Check Company Equality
     */
    @Test
    public void companyEq()
    {
        Organization c2 = new Organization("Google", 2000);
        assertEquals(c1, c2);

        c2.setOrgName("Amazon");
        assertNotEquals(c1, c2);
    }

    @Test
    public void companyComplete()
    {
        assertEquals(c1.getOrgName(), "Google");
        assertTrue(c1.getNumEmployees()== 1000);
    }
}