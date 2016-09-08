
require.config({

	paths: {
		
		"jquery": "../bower/jquery/dist/jquery.min",
		"bootstrap": "../bower/bootstrap/dist/js/bootstrap.min",
		"angular": "../bower/angular/angular",
		"angular-animate": "../bower/angular-animate/angular-animate",
		"angular-ui-router": "../bower/angular-ui-router/release/angular-ui-router",
		"angular-bootstrap": "../bower/angular-bootstrap/ui-bootstrap-tpls",
		"ie10-workaround": "../assets/lib/ie10/ie10-viewport-bug-workaround",

		"coreModule": "modules/core/module",
	},
	
	shim: {
		
		"bootstrap": {
			deps: [
			    "jquery",
			]
		},
		
		"angular": {
			deps: [
			    "jquery",
			]
		},
		
		"angular-ui-router": {
			deps: [
			    "angular",
			]
		},
		
		"angular-animate": {
			deps: [
			    "angular",
			]
		},
		
		"angular-bootstrap": {
			deps: [
			    "angular",
			    "bootstrap",
			]
		},
		
		"coreModule": {
			deps: [
			    "angular-animate",
			    "angular-ui-router",
			    "angular-bootstrap",
			    "ie10-workaround",
			]
		},
	},
});


require([ "coreModule" ], function() {

	
});
