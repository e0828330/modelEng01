/**
 */
package fml.util;

import fml.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see fml.FmlPackage
 * @generated
 */
public class FmlValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final FmlValidator INSTANCE = new FmlValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "fml";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FmlValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return FmlPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case FmlPackage.FORM:
				return validateForm((Form)value, diagnostics, context);
			case FmlPackage.PAGE:
				return validatePage((Page)value, diagnostics, context);
			case FmlPackage.PAGE_ELEMENT:
				return validatePageElement((PageElement)value, diagnostics, context);
			case FmlPackage.DISPLAY_ELEMENT:
				return validateDisplayElement((DisplayElement)value, diagnostics, context);
			case FmlPackage.HEADING:
				return validateHeading((Heading)value, diagnostics, context);
			case FmlPackage.TEXT_PARAGRAPH:
				return validateTextParagraph((TextParagraph)value, diagnostics, context);
			case FmlPackage.LIST:
				return validateList((List)value, diagnostics, context);
			case FmlPackage.LIST_ITEM:
				return validateListItem((ListItem)value, diagnostics, context);
			case FmlPackage.INPUT_ELEMENT:
				return validateInputElement((InputElement)value, diagnostics, context);
			case FmlPackage.TEXT_INPUT:
				return validateTextInput((TextInput)value, diagnostics, context);
			case FmlPackage.SELECT_FIELD:
				return validateSelectField((SelectField)value, diagnostics, context);
			case FmlPackage.SELECTION_ITEM:
				return validateSelectionItem((SelectionItem)value, diagnostics, context);
			case FmlPackage.TEXT_INPUT_TYPE:
				return validateTextInputType((TextInputType)value, diagnostics, context);
			case FmlPackage.SELECTION_TYPE:
				return validateSelectionType((SelectionType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForm(Form form, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(form, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(form, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(form, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(form, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(form, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(form, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(form, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(form, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(form, diagnostics, context);
		if (result || diagnostics != null) result &= validateForm_oneWelcomePage(form, diagnostics, context);
		if (result || diagnostics != null) result &= validateForm_oneFirstPage(form, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the oneWelcomePage constraint of '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FORM__ONE_WELCOME_PAGE__EEXPRESSION = "self.organized->select(p | p.isWelcome)->size() = 1 and self.organized.predecessor->isEmpty()";

	/**
	 * Validates the oneWelcomePage constraint of '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForm_oneWelcomePage(Form form, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FmlPackage.Literals.FORM,
				 form,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "oneWelcomePage",
				 FORM__ONE_WELCOME_PAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the oneFirstPage constraint of '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FORM__ONE_FIRST_PAGE__EEXPRESSION = "self.organized->select(p | p.predecessor->isEmpty())->size() = 1";

	/**
	 * Validates the oneFirstPage constraint of '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForm_oneFirstPage(Form form, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FmlPackage.Literals.FORM,
				 form,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "oneFirstPage",
				 FORM__ONE_FIRST_PAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(page, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(page, diagnostics, context);
		if (result || diagnostics != null) result &= validatePage_titleStartsUpperCase(page, diagnostics, context);
		if (result || diagnostics != null) result &= validatePage_noCycles(page, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the titleStartsUpperCase constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PAGE__TITLE_STARTS_UPPER_CASE__EEXPRESSION = "not (Title.size()=0) and Title.at(1) = Title.at(1).toUpper()";

	/**
	 * Validates the titleStartsUpperCase constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage_titleStartsUpperCase(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FmlPackage.Literals.PAGE,
				 page,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "titleStartsUpperCase",
				 PAGE__TITLE_STARTS_UPPER_CASE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noCycles constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PAGE__NO_CYCLES__EEXPRESSION = "self.predecessor->asSet()->union(self.predecessor->closure(p | p.predecessor))->excludes(self)";

	/**
	 * Validates the noCycles constraint of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage_noCycles(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FmlPackage.Literals.PAGE,
				 page,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noCycles",
				 PAGE__NO_CYCLES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageElement(PageElement pageElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pageElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validatePageElement_uniqueID(pageElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the uniqueID constraint of '<em>Page Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PAGE_ELEMENT__UNIQUE_ID__EEXPRESSION = "PageElement.allInstances()->forAll(e1, e2 | e1 <> e2 implies e1.oclAsType(PageElement).ID <> e2.oclAsType(PageElement).ID)";

	/**
	 * Validates the uniqueID constraint of '<em>Page Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageElement_uniqueID(PageElement pageElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FmlPackage.Literals.PAGE_ELEMENT,
				 pageElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueID",
				 PAGE_ELEMENT__UNIQUE_ID__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplayElement(DisplayElement displayElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(displayElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(displayElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(displayElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(displayElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(displayElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(displayElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(displayElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(displayElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(displayElement, diagnostics, context);
		if (result || diagnostics != null) result &= validatePageElement_uniqueID(displayElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeading(Heading heading, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(heading, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(heading, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(heading, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(heading, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(heading, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(heading, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(heading, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(heading, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(heading, diagnostics, context);
		if (result || diagnostics != null) result &= validatePageElement_uniqueID(heading, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextParagraph(TextParagraph textParagraph, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(textParagraph, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(textParagraph, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(textParagraph, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(textParagraph, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(textParagraph, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(textParagraph, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(textParagraph, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(textParagraph, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(textParagraph, diagnostics, context);
		if (result || diagnostics != null) result &= validatePageElement_uniqueID(textParagraph, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateList(List list, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(list, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(list, diagnostics, context);
		if (result || diagnostics != null) result &= validatePageElement_uniqueID(list, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListItem(ListItem listItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(listItem, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(listItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(listItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(listItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(listItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(listItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(listItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(listItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(listItem, diagnostics, context);
		if (result || diagnostics != null) result &= validatePageElement_uniqueID(listItem, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputElement(InputElement inputElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(inputElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(inputElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(inputElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(inputElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(inputElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(inputElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(inputElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(inputElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(inputElement, diagnostics, context);
		if (result || diagnostics != null) result &= validatePageElement_uniqueID(inputElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextInput(TextInput textInput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(textInput, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(textInput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(textInput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(textInput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(textInput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(textInput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(textInput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(textInput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(textInput, diagnostics, context);
		if (result || diagnostics != null) result &= validatePageElement_uniqueID(textInput, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectField(SelectField selectField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(selectField, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(selectField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(selectField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(selectField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(selectField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(selectField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(selectField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(selectField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(selectField, diagnostics, context);
		if (result || diagnostics != null) result &= validatePageElement_uniqueID(selectField, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionItem(SelectionItem selectionItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(selectionItem, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(selectionItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(selectionItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(selectionItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(selectionItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(selectionItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(selectionItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(selectionItem, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(selectionItem, diagnostics, context);
		if (result || diagnostics != null) result &= validateSelectionItem_selectionIsOfSubsequentPage(selectionItem, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the selectionIsOfSubsequentPage constraint of '<em>Selection Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SELECTION_ITEM__SELECTION_IS_OF_SUBSEQUENT_PAGE__EEXPRESSION = "self.displayElementVisible -> forAll(e |e.contained.predecessor->asSet()->union(e.contained.predecessor->closure(p | p.predecessor))->includes(self.contained.contained))";

	/**
	 * Validates the selectionIsOfSubsequentPage constraint of '<em>Selection Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionItem_selectionIsOfSubsequentPage(SelectionItem selectionItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FmlPackage.Literals.SELECTION_ITEM,
				 selectionItem,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "selectionIsOfSubsequentPage",
				 SELECTION_ITEM__SELECTION_IS_OF_SUBSEQUENT_PAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextInputType(TextInputType textInputType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionType(SelectionType selectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //FmlValidator
