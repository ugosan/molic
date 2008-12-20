/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.puc.molic.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import br.puc.molic.MolicPackage;
import br.puc.molic.Scene;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scene</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.puc.molic.impl.SceneImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.puc.molic.impl.SceneImpl#getDialogue <em>Dialogue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SceneImpl extends EObjectImpl implements Scene {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDialogue() <em>Dialogue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDialogue()
	 * @generated
	 * @ordered
	 */
	protected static final String DIALOGUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDialogue() <em>Dialogue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDialogue()
	 * @generated
	 * @ordered
	 */
	protected String dialogue = DIALOGUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SceneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MolicPackage.Literals.SCENE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MolicPackage.SCENE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDialogue() {
		return dialogue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDialogue(String newDialogue) {
		String oldDialogue = dialogue;
		dialogue = newDialogue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MolicPackage.SCENE__DIALOGUE, oldDialogue, dialogue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MolicPackage.SCENE__NAME:
				return getName();
			case MolicPackage.SCENE__DIALOGUE:
				return getDialogue();
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
			case MolicPackage.SCENE__NAME:
				setName((String)newValue);
				return;
			case MolicPackage.SCENE__DIALOGUE:
				setDialogue((String)newValue);
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
			case MolicPackage.SCENE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MolicPackage.SCENE__DIALOGUE:
				setDialogue(DIALOGUE_EDEFAULT);
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
			case MolicPackage.SCENE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MolicPackage.SCENE__DIALOGUE:
				return DIALOGUE_EDEFAULT == null ? dialogue != null : !DIALOGUE_EDEFAULT.equals(dialogue);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", dialogue: ");
		result.append(dialogue);
		result.append(')');
		return result.toString();
	}

} //SceneImpl