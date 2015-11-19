/**
 * 
 */
package de.evoila.cf.cpi.openstack.custom.props;

import java.util.Map;

import de.evoila.cf.broker.model.Plan;
import de.evoila.cf.broker.model.ServiceInstance;

/**
 * @author Christian Brinker, evoila.
 *
 */
public class RabbitMQCustomPropertyHandler implements DomainBasedCustomPropertyHandler {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.evoila.cf.cpi.openstack.custom.props.DomainBasedCustomPropertyHandler#
	 * addDomainBasedCustomProperties(de.evoila.cf.broker.model.Plan,
	 * java.util.Map, java.lang.String)
	 */
	@Override
	public Map<String, String> addDomainBasedCustomProperties(Plan plan, Map<String, String> customProperties,
			ServiceInstance serviceInstance) {
		String id = serviceInstance.getId();
		customProperties.put("rabbit_vhost", id);
		customProperties.put("rabbit_user", id);
		customProperties.put("rabbit_password", id);
		
		return customProperties;
	}
}
