package com.proofpoint.reporting;

import javax.management.AttributeNotFoundException;
import javax.management.MBeanException;
import javax.management.ReflectionException;

interface HealthBeanAttribute
{
    String getDescription();

    boolean isRemoveFromRotation();

    String getValue()
            throws AttributeNotFoundException, MBeanException, ReflectionException;
}
