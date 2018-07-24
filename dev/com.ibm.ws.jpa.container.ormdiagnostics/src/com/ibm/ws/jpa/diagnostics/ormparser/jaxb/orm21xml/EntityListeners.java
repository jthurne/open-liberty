/*******************************************************************************
 * Copyright (c) 2011, 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.12 at 04:14:13 PM CDT 
//


package com.ibm.ws.jpa.diagnostics.ormparser.jaxb.orm21xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 *         @Target({TYPE}) @Retention(RUNTIME)
 *         public @interface EntityListeners {
 *           Class[] value();
 *         }
 * 
 *       
 * 
 * <p>Java class for entity-listeners complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entity-listeners">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entity-listener" type="{http://xmlns.jcp.org/xml/ns/persistence/orm}entity-listener" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entity-listeners", propOrder = {
    "entityListener"
})
public class EntityListeners {

    @XmlElement(name = "entity-listener")
    protected List<EntityListener> entityListener;

    /**
     * Gets the value of the entityListener property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityListener property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityListener().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityListener }
     * 
     * 
     */
    public List<EntityListener> getEntityListener() {
        if (entityListener == null) {
            entityListener = new ArrayList<EntityListener>();
        }
        return this.entityListener;
    }

}