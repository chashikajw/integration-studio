/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.wso2.developerstudio.esb.form.editors.article.rcp;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.*;
import org.eclipse.ui.forms.widgets.*;
import org.wso2.developerstudio.esb.forgm.editors.article.FormArticlePlugin;
/**
 * 
 * To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Generation - Code and Comments
 */
public class MasterDetailsPage extends FormPage {
	private ScrolledPropertiesBlock block;
	public MasterDetailsPage(FormEditor editor) {
		super(editor, "fourth", Messages.getString("MasterDetailsPage.label")); //$NON-NLS-1$ //$NON-NLS-2$
		block = new ScrolledPropertiesBlock(this);
	}
	protected void createFormContent(final IManagedForm managedForm) {
		final ScrolledForm form = managedForm.getForm();
		//FormToolkit toolkit = managedForm.getToolkit();
		form.setText(Messages.getString("MasterDetailsPage.title")); //$NON-NLS-1$
		form.setBackgroundImage(FormArticlePlugin.getDefault().getImage(
				FormArticlePlugin.IMG_FORM_BG));
		block.createContent(managedForm);
	}
}