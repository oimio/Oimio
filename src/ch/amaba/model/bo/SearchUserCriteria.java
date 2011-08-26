package ch.amaba.model.bo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SearchUserCriteria {

	final HashMap<String, Set<String>> criteria;

	public SearchUserCriteria() {
		criteria = new HashMap<String, Set<String>>();
	}

	public void addCriteria(String key, String value) {
		final Set<String> values = criteria.get(key);
		if (values == null) {
			final HashSet<String> set = new HashSet<String>();
			set.add(value);
			criteria.put(key, set);
		} else {
			values.add(value);
		}
	}

	public HashMap<String, Set<String>> getCriteria() {
		return criteria;
	}
}
