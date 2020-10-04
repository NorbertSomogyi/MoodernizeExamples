package application;

/*
 * Copyright (C) 2015 Freie Universität Berlin
 *
 * This file is subject to the terms and conditions of the GNU Lesser
 * General Public License v2.1. See the file LICENSE in the top level
 * directory for more details.
 */
/**
 * @defgroup    sys_saul_reg SAUL registry
 * @ingroup     sys
 * @brief       Global sensor/actuator registry for SAUL devices
 *
 * @see @ref drivers_saul
 *
 * @{
 *
 * @file
 * @brief       SAUL registry interface definition
 *
 * @author      Hauke Petersen <hauke.petersen@fu-berlin.de>
 */
/**
 * @brief   SAUL registry entry
 */
/**< pointer to the next device */
public class saul_reg {
	private saul_reg next;
	private Object dev;
	private Object name;
	private Object driver;
	
	public saul_reg(saul_reg next, Object dev, Object name, Object driver) {
		setNext(next);
		setDev(dev);
		setName(name);
		setDriver(driver);
	}
	public saul_reg() {
	}
	
	/*
	 * Copyright (C) 2015 Freie Universität Berlin
	 *
	 * This file is subject to the terms and conditions of the GNU Lesser
	 * General Public License v2.1. See the file LICENSE in the top level
	 * directory for more details.
	 *
	 */
	/**
	 * @ingroup     sys_shell_commands
	 * @{
	 *
	 * @file
	 * @brief       SAUL registry shell commands
	 *
	 * @author      Hauke Petersen <hauke.petersen@fu-berlin.de>
	 *
	 * @}
	 */
	/* this function does not check, if the given device is valid */
	public void probe(int num) {
		int dim;
		phydat_t res = new phydat_t();
		dim = ModernizedCProgram.saul_reg_read(dev, res);
		if (dim <= 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("error: failed to read from device #%i\n", num);
			return /*Error: Unsupported expression*/;
		} 
		Object generatedName = this.getName();
		Object generatedDriver = this.getDriver();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Reading from #%i (%s|%s)\n", num, generatedName, /*Error: Function owner not recognized*/saul_class_to_str(generatedDriver.getType()));
		res.phydat_dump(dim);
	}
	public int saul_reg_add() {
		saul_reg_t tmp = ModernizedCProgram.saul_reg;
		if (dev == (null)) {
			return -ENODEV;
		} 
		this.setNext((null));
		saul_reg generatedNext = tmp.getNext();
		if (ModernizedCProgram.saul_reg == (null)) {
			ModernizedCProgram.saul_reg = dev;
		} else {
				while (generatedNext != (null)) {
					tmp = generatedNext;
				}
				tmp.setNext(dev);
		} 
		return 0;
	}
	public int saul_reg_rm() {
		saul_reg_t tmp = ModernizedCProgram.saul_reg;
		if (ModernizedCProgram.saul_reg == (null) || dev == (null)) {
			return -ENODEV;
		} 
		saul_reg generatedNext = this.getNext();
		if (ModernizedCProgram.saul_reg == dev) {
			ModernizedCProgram.saul_reg = generatedNext;
			return 0;
		} 
		while (generatedNext && (generatedNext != dev)) {
			tmp = generatedNext;
		}
		if (generatedNext == dev) {
			tmp.setNext(generatedNext);
		} else {
				return -ENODEV;
		} 
		return 0;
	}
	public saul_reg saul_reg_find_nth(int pos) {
		saul_reg_t tmp = ModernizedCProgram.saul_reg;
		saul_reg generatedNext = tmp.getNext();
		for (int i = 0;
		 (i < pos) && tmp; i++) {
			tmp = generatedNext;
		}
		return tmp;
	}
	public saul_reg saul_reg_find_type(Object type) {
		saul_reg_t tmp = ModernizedCProgram.saul_reg;
		Object generatedDriver = tmp.getDriver();
		saul_reg generatedNext = tmp.getNext();
		while (tmp) {
			if (generatedDriver.getType() == type) {
				return tmp;
			} 
			tmp = generatedNext;
		}
		return (null);
	}
	public saul_reg saul_reg_find_name(Object name) {
		saul_reg_t tmp = ModernizedCProgram.saul_reg;
		Object generatedName = tmp.getName();
		saul_reg generatedNext = tmp.getNext();
		while (tmp) {
			if (/*Error: Function owner not recognized*/strcmp(generatedName, name) == 0) {
				return tmp;
			} 
			tmp = generatedNext;
		}
		return (null);
	}
	public saul_reg getNext() {
		return next;
	}
	public void setNext(saul_reg newNext) {
		next = newNext;
	}
	public Object getDev() {
		return dev;
	}
	public void setDev(Object newDev) {
		dev = newDev;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public Object getDriver() {
		return driver;
	}
	public void setDriver(Object newDriver) {
		driver = newDriver;
	}
}
