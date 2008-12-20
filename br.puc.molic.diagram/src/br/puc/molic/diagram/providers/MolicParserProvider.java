package br.puc.molic.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import br.puc.molic.MolicPackage;
import br.puc.molic.diagram.edit.parts.BRTUtteranceLabelEditPart;
import br.puc.molic.diagram.edit.parts.MonologueLabelEditPart;
import br.puc.molic.diagram.edit.parts.SceneDialogueEditPart;
import br.puc.molic.diagram.edit.parts.SceneNameEditPart;
import br.puc.molic.diagram.edit.parts.UtteranceLabelEditPart;
import br.puc.molic.diagram.parsers.CompositeParser;
import br.puc.molic.diagram.parsers.MessageFormatParser;
import br.puc.molic.diagram.parsers.NativeParser;
import br.puc.molic.diagram.part.MetaModelFacility;
import br.puc.molic.diagram.part.MolicVisualIDRegistry;

/**
 * @generated
 */
public class MolicParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser sceneName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getSceneName_5001Parser() {
		if (sceneName_5001Parser == null) {
			sceneName_5001Parser = createSceneName_5001Parser();
		}
		return sceneName_5001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSceneName_5001Parser() {
		EAttribute[] features = new EAttribute[] { MolicPackage.eINSTANCE
				.getScene_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser sceneDialogue_5002Parser;

	/**
	 * @generated
	 */
	private IParser getSceneDialogue_5002Parser() {
		if (sceneDialogue_5002Parser == null) {
			sceneDialogue_5002Parser = createSceneDialogue_5002Parser();
		}
		return sceneDialogue_5002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSceneDialogue_5002Parser() {
		EAttribute[] features = new EAttribute[] { MolicPackage.eINSTANCE
				.getScene_Dialogue(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser monologueLabel_5003Parser;

	/**
	 * @generated
	 */
	private IParser getMonologueLabel_5003Parser() {
		if (monologueLabel_5003Parser == null) {
			monologueLabel_5003Parser = createMonologueLabel_5003Parser();
		}
		return monologueLabel_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createMonologueLabel_5003Parser() {
		EAttribute[] features = new EAttribute[] { MolicPackage.eINSTANCE
				.getMonologue_Label(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		parser.setViewPattern("<< {0} >>");
		parser.setEditorPattern("<< {0} >>");
		parser.setEditPattern("{0}");
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser utteranceLabel_6001Parser;

	/**
	 * @generated
	 */
	private IParser getUtteranceLabel_6001Parser() {
		if (utteranceLabel_6001Parser == null) {
			utteranceLabel_6001Parser = createUtteranceLabel_6001Parser();
		}
		return utteranceLabel_6001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createUtteranceLabel_6001Parser() {
		EAttribute[] features = new EAttribute[] { MolicPackage.eINSTANCE
				.getConnection_Label(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser bRTUtteranceLabel_6002Parser;

	/**
	 * @generated
	 */
	private IParser getBRTUtteranceLabel_6002Parser() {
		if (bRTUtteranceLabel_6002Parser == null) {
			bRTUtteranceLabel_6002Parser = createBRTUtteranceLabel_6002Parser();
		}
		return bRTUtteranceLabel_6002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createBRTUtteranceLabel_6002Parser() {
		EAttribute[] features = new EAttribute[] { MolicPackage.eINSTANCE
				.getConnection_Label(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case SceneNameEditPart.VISUAL_ID:
			return getSceneName_5001Parser();
		case SceneDialogueEditPart.VISUAL_ID:
			return getSceneDialogue_5002Parser();
		case MonologueLabelEditPart.VISUAL_ID:
			return getMonologueLabel_5003Parser();
		case UtteranceLabelEditPart.VISUAL_ID:
			return getUtteranceLabel_6001Parser();
		case BRTUtteranceLabelEditPart.VISUAL_ID:
			return getBRTUtteranceLabel_6002Parser();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(MolicVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(MolicVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (MolicElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}
}
