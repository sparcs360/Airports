/*
SELECT	*
FROM	Country

SELECT	code,
		COUNT(*)
FROM	Country
GROUP BY
		code
HAVING	COUNT(*) > 1
ORDER BY
		COUNT(*) DESC

SELECT	code,
		COUNT(*)
FROM	Country
GROUP BY
		code
HAVING	COUNT(*) > 1
ORDER BY
		COUNT(*) DESC

*/
