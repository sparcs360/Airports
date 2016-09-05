/*

SELECT	*
FROM	Airport
WHERE	ident = 'EGLL'

SELECT	COUNT(*)
FROM	Airport
WHERE	ident IS NULL

SELECT	COUNT(*)
FROM	Airport
WHERE	LEN(iata_code) = 0

SELECT	COUNT(*)
FROM	Airport
WHERE	LEN(local_code) = 0

SELECT	ident,
		COUNT(*)
FROM	Airport
GROUP BY
		ident
HAVING	COUNT(*) > 1
ORDER BY
		COUNT(*) DESC

SELECT	iso_region
,		municipality
,		COUNT(*)
FROM	Airport
GROUP BY
		iso_region
,		municipality
--HAVING	COUNT(*) > 1
ORDER BY
		COUNT(*) DESC

SELECT	iso_region
,		COUNT(*)
FROM	Airport
GROUP BY
		iso_region
--HAVING	COUNT(*) > 1
ORDER BY
		COUNT(*) DESC

---

SELECT	A.iata_code
,		A.gps_code
FROM	Airport A
JOIN	Country C ON (C.code = A.iso_country)
WHERE	A.ident = 'EGLL'
GO

*/
