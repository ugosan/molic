/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.puc.molic.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import br.puc.molic.Connection;
import br.puc.molic.Diagram;
import br.puc.molic.Element;
import br.puc.molic.MolicPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.puc.molic.impl.DiagramImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link br.puc.molic.impl.DiagramImpl#getUtterances <em>Utterances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramImpl extends EObjectImpl implements Diagram {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList elements;

	/**
	 * The cached value of the '{@link #getUtterances() <em>Utterances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtterances()
	 * @generated
	 * @ordered
	 */
	protected EList utterances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MolicPackage.Literals.DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList(Element.class, this, MolicPackage.DIAGRAM__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUtterances() {
		if (utterances == null) {
			utterances = new EObjectContainmentEList(Connection.class, this, MolicPackage.DIAGRAM__UTTERANCES);
		}
		return utterances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MolicPackage.DIAGRAM__ELEMENTS:
				return ((InternalEList)getElements()).basicRemove(otherEnd, msgs);
			case MolicPackage.DIAGRAM__UTTERANCES:
				return ((InternalEList)getUtterances()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MolicPackage.DIAGRAM__ELEMENTS:
				return getElements();
			case MolicPackage.DIAGRAM__UTTERANCES:
				return getUtterances();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MolicPackage.DIAGRAM__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection)newValue);
				return;
			case MolicPackage.DIAGRAM__UTTERANCES:
				getUtterances().clear();
				getUtterances().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case MolicPackage.DIAGRAM__ELEMENTS:
				getElements().clear();
				return;
			case MolicPackage.DIAGRAM__UTTERANCES:
				getUtterances().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MolicPackage.DIAGRAM__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case MolicPackage.DIAGRAM__UTTERANCES:
				return utterances != null && !utterances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiagramImpl