package com.lv.tica;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedMetric;

public interface Counter {

	public abstract int getCounter();

}