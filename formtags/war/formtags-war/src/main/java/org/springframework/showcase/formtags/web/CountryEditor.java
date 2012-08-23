/*******************************************************************************
 * Copyright (c) 2008, 2010 VMware Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   VMware Inc. - initial contribution
 *******************************************************************************/

package org.springframework.showcase.formtags.web;



import org.springframework.showcase.formtags.domain.Country;

import org.springframework.showcase.formtags.service.UserManager;



import java.beans.PropertyEditorSupport;



/**

 * Simple {@link java.beans.PropertyEditor} for the {@link org.springframework.showcase.formtags.domain.Country} class.

 * 


 */

public class CountryEditor extends PropertyEditorSupport {



    private UserManager userManager;





    /**

     * Creates a new instance of the {@link org.springframework.showcase.formtags.web.CountryEditor} class.

     *

     * @param userManager the service object that is to be used to resolve country codes

     */

    public CountryEditor(UserManager userManager) {

        this.userManager = userManager;

    }





    public void setAsText(String text) throws IllegalArgumentException {

        setValue(this.userManager.findCountry(text));

    }



    public String getAsText() {

        if (getValue() == null) {

            return "";

        }

        return ((Country) getValue()).getCode();

    }



}

