

define(["modules/core/runners/logRunner"], function(logRunner) {

	var app = angular.module("coreModule", ['ui.router', 'ngAnimate', 'ui.bootstrap']);
	app.run(logRunner);
	
	app.config(function($stateProvider, $urlRouterProvider, $controllerProvider){
		
		var origController = app.controller
		app.controller = function (name, constructor){
			$controllerProvider.register(name, constructor);
			return origController.apply(this, arguments);
		}

		var viewsPrefix = 'app/views/';

		// For any unmatched url, send to /
		$urlRouterProvider.otherwise("/")

		$stateProvider
			// you can set this to no template if you just want to use the html in the page
			.state('home', {
				url: "/",
				templateUrl: viewsPrefix + "home.html",
				data: {
					pageTitle: 'Home'
				}
			})
			.state('search', {
				url: "/search",
				templateUrl: viewsPrefix + "search.html",
				data: {
					pageTitle: 'Search'
				}
			})
			.state('about', {
				url: "/about",
				templateUrl: viewsPrefix + "about.html",
				data: {
					pageTitle: 'About'
				}
			})
			.state('contact', {
				url: "/contact",
				templateUrl: viewsPrefix + "contact.html",
				data: {
					pageTitle: 'Contact'
				}
			})
			.state('signup', {
				url: "/signup",
				templateUrl: viewsPrefix + "signup.html",
				data: {
					pageTitle: 'Sign Up'
				}
			})
			.state('login', {
				url: "/login",
				templateUrl: viewsPrefix + "login.html",
				data: {
					pageTitle: 'Login'
				}
			})
	});
	
	app.directive('updateTitle', ['$rootScope', '$timeout',
		function($rootScope, $timeout) {
			return {
				link: function(scope, element) {
					var listener = function(event, toState) {
						var title = "Airports!";
						if (toState.data && toState.data.pageTitle) title = toState.data.pageTitle + ' - ' + title;
						$timeout(function() {
							element.text(title);
						}, 0, false);
					};

					$rootScope.$on('$stateChangeSuccess', listener);
				}
			};
		}
	]);
	
	require(["modules/core/controllers/nav"], function() {
	
		angular.bootstrap(document, ["coreModule"]);
	});
});
