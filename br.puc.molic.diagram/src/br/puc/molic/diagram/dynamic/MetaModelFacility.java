package br.puc.molic.diagram.dynamic;

import java.text.MessageFormat;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

public class MetaModelFacility {

	/**
	 * @generated
	 */
	private static MetaModelFacility instanceMolic;

	/**
	 * @generated
	 */
	private final EPackage ePackage;

	/**
	 * @generated
	 */
	private MetaModelFacility(EPackage ePackage) {
		this.ePackage = ePackage;
	}

	/**
	 * @throws IllegalStateException if no EPackage with given URI is registered.
	 * @generated
	 */
	public static MetaModelFacility getMolic() {
		if (instanceMolic == null) {
			EPackage pkg = getRegistry().getEPackage("molic");
			if (pkg == null) {
				throw new IllegalStateException(
						"Package molic(molic) not found");
			}
			instanceMolic = new MetaModelFacility(pkg);
			instanceMolic.initMolic();
		}
		return instanceMolic;
	}

	/**
	 * Default implementation returns global registry, clients that need another may redefine.
	 * @generated
	 */
	private static EPackage.Registry getRegistry() {
		return EPackage.Registry.INSTANCE;
	}

	/**
	 * @generated
	 */
	public boolean isInstance(Object obj, String metaClassName) {
		EClass metaClass = getEClass(metaClassName);
		return obj instanceof EObject
				&& metaClass.isSuperTypeOf(((EObject) obj).eClass());
	}

	/**
	 * @generated
	 */
	public EObject newInstance(String metaClassName) {
		return this.ePackage.getEFactoryInstance().create(
				getEClass(metaClassName));
	}

	/**
	 * @generated
	 */
	public EClass getEClass(String metaClassName) {
		assert metaClassName != null;
		EClass metaClass = findMetaClass(metaClassName);
		assertMetaClass(metaClass, metaClassName);
		return metaClass;
	}

	/**
	 * @generated
	 */
	public EStructuralFeature getEFeature(String metaClassName,
			String metaFeatureName) {
		assert metaFeatureName != null;
		EClass metaClass = getEClass(metaClassName);
		EStructuralFeature f = metaClass.getEStructuralFeature(metaFeatureName);
		assertMetaFeature(f, metaClass, metaFeatureName);
		return f;
	}

	/**
	 * @generated
	 */
	public EAttribute getEAttribute(String metaClassName, String metaFeatureName) {
		return (EAttribute) getEFeature(metaClassName, metaFeatureName);
	}

	/**
	 * @generated
	 */
	public EReference getEReference(String metaClassName, String metaFeatureName) {
		return (EReference) getEFeature(metaClassName, metaFeatureName);
	}

	/**
	 * @generated
	 */
	public EDataType getEDataType(String metaClassName) {
		assert metaClassName != null;
		EClassifier c = this.ePackage.getEClassifier(metaClassName);
		if (false == c instanceof EDataType) {
			return null;
		}
		return (EDataType) c;
	}

	/**
	 * @generated
	 */
	public EEnum getEEnum(String metaClassName) {
		assert metaClassName != null;
		EClassifier c = this.ePackage.getEClassifier(metaClassName);
		if (false == c instanceof EEnum) {
			return null;
		}
		return (EEnum) c;
	}

	/**
	 * @generated
	 */
	private EClass findMetaClass(String name) {
		EClassifier c = this.ePackage.getEClassifier(name);
		if (false == c instanceof EClass) {
			return null;
		}
		return (EClass) c;
	}

	/**
	 * Default implementation throws IllegalStateException if metaclass is null
	 * @generated
	 */
	private void assertMetaClass(EClass metaClass, String metaClassName) {
		if (metaClass == null) {
			throw new IllegalStateException(MessageFormat.format(
					"Can't find class {0} in the package {1}", new Object[] {
							metaClassName, this.ePackage.getName() }));
		}
	}

	/**
	 * Default implementation throws IllegalStateException if meta-feature is null
	 * @generated
	 */
	private void assertMetaFeature(EStructuralFeature metaFeature,
			EClass metaClass, String featureName) {
		if (metaFeature == null) {
			throw new IllegalStateException(MessageFormat.format(
					"Can't find feature {0} of class {1} in the package {2}",
					new Object[] { featureName, metaClass.getName(),
							this.ePackage.getName() }));
		}
	}

	/**
	 * @generated
	 */
	private void initMolic() {
	}
}
