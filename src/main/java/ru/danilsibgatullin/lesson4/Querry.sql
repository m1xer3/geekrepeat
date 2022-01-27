select
film1.filmName as "Film-1",
ses.session_start,
film1.timecode as "Film -1 time",
film2.filmName as "Film-2",
ses2.session_start,
film2.timecode as "Film -2 time"
 from cinema.sessions ses
left join cinema.films film1 on film1.filmId = ses.filmId
inner join cinema.sessions ses2 on ses2.session_start between ses.session_start and date_add(ses.session_start, INTERVAL film1.timecode MINUTE) and ses.filmId<>ses2.filmId
left join cinema.films film2 on ses2.filmId = film2.filmId
order by ses.session_start;


select
film1.filmName as "film name",
ses.session_start as "session start time",
film1.timecode as "film duration",
ses2.session_start "next film start time",
timediff(ses2.session_start,ses.session_end) as  diff
from
(select ses.sessionId,ses.session_start,
date_add(ses.session_start, INTERVAL film1.timecode MINUTE) as session_end,
film1.filmId,
row_number() over (order by ses.session_start) as rownumber
 from cinema.sessions ses
left join cinema.films film1 on film1.filmId = ses.filmId) ses
left join (select ses.sessionId,ses.session_start,
date_add(ses.session_start, INTERVAL film1.timecode MINUTE) as session_end,
film1.filmId,
row_number() over (order by ses.session_start) as rownumber
 from cinema.sessions ses
left join cinema.films film1 on film1.filmId = ses.filmId) ses2 on ses2.rownumber=ses.rownumber+1
left join cinema.films film1 on film1.filmId = ses.filmId
left join cinema.films film2 on film2.filmId = ses2.filmId
where timediff(ses2.session_start,ses.session_end)>= '00:30:00'
order by timediff(ses2.session_start,ses.session_end);


