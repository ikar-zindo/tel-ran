-- Вывести информацию по стримам (проекция: имя_автора, название_стрима)

SELECT 
	S.title,
	R.creat_at,
	R.value
FROM streams AS S
	LEFT JOIN reactions AS R USING(stream_id);

SELECT 
	S.title,
	R.creat_at,
	R.value,
	U.username
FROM streams AS S
	LEFT JOIN reactions AS R USING(stream_id),
	LEFT JOIN users AS U ON(user_id);

