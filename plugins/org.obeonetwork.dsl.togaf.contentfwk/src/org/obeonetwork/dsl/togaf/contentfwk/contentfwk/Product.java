/**
 * Copyright (c) 2011 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 * 
 */
package org.obeonetwork.dsl.togaf.contentfwk.contentfwk;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Product#getIsProducedByOrganizationUnits <em>Is Produced By Organization Units</em>}</li>
 *   <li>{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Product#getIsProducedByProcesses <em>Is Produced By Processes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends Element {
	/**
	 * Returns the value of the '<em><b>Is Produced By Organization Units</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getProducesProducts <em>Produces Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Produced By Organization Units</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Produced By Organization Units</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getProduct_IsProducedByOrganizationUnits()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.OrganizationUnit#getProducesProducts
	 * @model opposite="producesProducts"
	 * @generated
	 */
	EList<OrganizationUnit> getIsProducedByOrganizationUnits();

	/**
	 * Returns the value of the '<em><b>Is Produced By Processes</b></em>' reference list.
	 * The list contents are of type {@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process}.
	 * It is bidirectional and its opposite is '{@link org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getProducesProducts <em>Produces Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Produced By Processes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Produced By Processes</em>' reference list.
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.ContentfwkPackage#getProduct_IsProducedByProcesses()
	 * @see org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process#getProducesProducts
	 * @model opposite="producesProducts"
	 * @generated
	 */
	EList<org.obeonetwork.dsl.togaf.contentfwk.contentfwk.Process> getIsProducedByProcesses();

} // Product
