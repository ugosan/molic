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
 *   <li>{@link br.puc.molic.impl.DiagramImpl#getElement <em>Element</em>}</li>
 *   <li>{@link br.puc.molic.impl.DiagramImpl#getUtterance <em>Utterance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramImpl extends EObjectImpl implements Diagram {
	/**
	 * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement()
	 * @generated
	 * @ordered
	 */
	protected EList element;

	/**
	 * The cached value of the '{@link #getUtterance() <em>Utterance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtterance()
	 * @generated
	 * @ordered
	 */
	protected EList utterance;

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
	public EList getElement() {
		if (element == null) {
			element = new EObjectContainmentEList(Element.class, this, MolicPackage.DIAGRAM__ELEMENT);
		}
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getUtterance() {
		if (utterance == null) {
			utterance = new EObjectContainmentEList(Connection.class, this, MolicPackage.DIAGRAM__UTTERANCE);
		}
		return utterance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MolicPackage.DIAGRAM__ELEMENT:
				return ((InternalEList)getElement()).basicRemove(otherEnd, msgs);
			case MolicPackage.DIAGRAM__UTTERANCE:
				return ((InternalEList)getUtterance()).basicRemove(otherEnd, msgs);
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
			case MolicPackage.DIAGRAM__ELEMENT:
				return getElement();
			case MolicPackage.DIAGRAM__UTTERANCE:
				return getUtterance();
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
			case MolicPackage.DIAGRAM__ELEMENT:
				getElement().clear();
				getElement().addAll((Collection)newValue);
				return;
			case MolicPackage.DIAGRAM__UTTERANCE:
				getUtterance().clear();
				getUtterance().addAll((Collection)newValue);
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
			case MolicPackage.DIAGRAM__ELEMENT:
				getElement().clear();
				return;
			case MolicPackage.DIAGRAM__UTTERANCE:
				getUtterance().clear();
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
			case MolicPackage.DIAGRAM__ELEMENT:
				return element != null && !element.isEmpty();
			case MolicPackage.DIAGRAM__UTTERANCE:
				return utterance != null && !utterance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DiagramImpl