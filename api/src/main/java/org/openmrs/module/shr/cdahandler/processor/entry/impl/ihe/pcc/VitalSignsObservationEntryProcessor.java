package org.openmrs.module.shr.cdahandler.processor.entry.impl.ihe.pcc;

import org.openmrs.module.shr.cdahandler.CdaHandlerConstants;
import org.openmrs.module.shr.cdahandler.processor.annotation.ProcessTemplates;
import org.openmrs.module.shr.cdahandler.processor.annotation.TemplateId;

/**
 * A template processor which can handle vital signs
 */
@ProcessTemplates(
	process = {
			@TemplateId(root = CdaHandlerConstants.ENT_TEMPLATE_VITAL_SIGNS_OBSERVATION)
	})
public class VitalSignsObservationEntryProcessor extends SimpleObservationEntryProcessor {


	/**
	 * Get the template name
	 * @see org.openmrs.module.shr.cdahandler.processor.entry.impl.ihe.pcc.SimpleObservationEntryProcessor#getTemplateName()
	 */
	@Override
    public String getTemplateName() {
		return "Vital Signs Observation";
    }
	
}
