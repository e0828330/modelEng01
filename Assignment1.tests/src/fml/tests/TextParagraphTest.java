/**
 */
package fml.tests;

import fml.FmlFactory;
import fml.TextParagraph;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Text Paragraph</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TextParagraphTest extends DisplayElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TextParagraphTest.class);
	}

	/**
	 * Constructs a new Text Paragraph test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextParagraphTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Text Paragraph test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TextParagraph getFixture() {
		return (TextParagraph)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FmlFactory.eINSTANCE.createTextParagraph());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TextParagraphTest
