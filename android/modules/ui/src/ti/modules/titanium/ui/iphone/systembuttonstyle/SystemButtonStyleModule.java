/**
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 */
package ti.modules.titanium.ui.iphone.systembuttonstyle;

import org.appcelerator.titanium.TiContext;
import org.appcelerator.titanium.TiDict;
import org.appcelerator.titanium.TiModule;

public class SystemButtonStyleModule extends TiModule
{
	private static TiDict constants;

	public SystemButtonStyleModule(TiContext tiContext) {
		super(tiContext);
	}

	@Override
	public TiDict getConstants() {
		if (constants == null) {
			constants = new TiDict();

			constants.put("BORDERED", "iphone only");
			constants.put("BAR", "iphone only");
			constants.put("DONE", "iphone only");
			constants.put("PLAIN", "iphone only");
			constants.put("FLEXIBLE_SPACE", "iphone only");
		}

		return constants;
	}

}
