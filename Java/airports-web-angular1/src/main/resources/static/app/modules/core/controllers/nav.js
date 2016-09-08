

define(function() {
	
	var coreModule = angular.module("coreModule");
	coreModule.controller("navController", function($scope, $state) {
		
		$scope.title = "Airports!";

		// returns true if the current router url matches the passed in url
		// so views can set 'active' on links easily
		$scope.isUrl = function(url) {
			if (url === '#') return false;
			return ('#' + $state.$current.url.source + '/').indexOf(url + '/') === 0;
		};

		$scope.pages = [
			{
				name: 'Help',
				url: '#',
				subPages: [
					{
						name: 'About',
						url: '#/about'
					},
					{},
					{
						name: 'Contact',
						url: '#/contact'
					}
				]
			}
		]
	});	
});
