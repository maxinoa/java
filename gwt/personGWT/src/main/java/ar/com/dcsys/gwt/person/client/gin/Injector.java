package ar.com.dcsys.gwt.person.client.gin;

import ar.com.dcsys.gwt.person.client.manager.PersonsManager;
import ar.com.dcsys.gwt.person.client.ui.UpdatePersonDataView;
import ar.com.dcsys.gwt.person.client.ui.basicData.PersonDataView;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;

@GinModules(PersonGWTGinModule.class)
public interface Injector extends Ginjector {

	public PersonDataView personDataView();
	public UpdatePersonDataView updatePersonDataView();
	
	public PersonsManager personsManager();
	
}
