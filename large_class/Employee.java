package com.directi.training.codesmells.largeclass;

public class Employee
{
    private final String _name;
    private final String _TelephoneNumber;

    public Employee(String name, Telephone TelephoneNumber)
    {
        _name = name;
        _TelephoneNumber = TelephoneNumber;
    }
	
    public String getName()
    {
        return _name;
    }
}

public class Telephone
{
    private final String _officeAreaCode;
    private final String _officeNumber;
    private final String _officeExtensionNumber;	
    
    public Telephone(String officeAreaCode,String officeNumber, 
                     String officeExtensionNumber)
    {
       _officeAreaCode = officeAreaCode;
       _officeNumber;= officeNumber;
       _officeExtensionNumber = officeExtensionNumber;       

    public String getTelephoneNumber()
    {
        return "(" + _officeAreaCode + ") " + _officeNumber + "-" + _officeExtensionNumber;
    }
}