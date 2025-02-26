[#ftl]

<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Swiss Tracker</title>
    <link rel="stylesheet" href="/style.css" type="text/css"/>
</head>
<body>
<nav>
    <a href="http://localhost:8080/">založi turnaj</a>
    <a href="http://localhost:8080/tournamentData">Informace o turnaji</a>
    <a href="http://localhost:8080/addPlayer">přidat hráče</a>
    <a href="http://localhost:8080/playersList">Seznam hráčů</a>
</nav>
<main>
    <h1>Informace o turnaji</h1>
        <div class="formInput"><strong>Název turnaje:</strong> ${tournament.tournamentName}</div>
        <div class="formInput"><strong>Pořadatel:</strong> ${tournament.tournamentOrganizer}</div>
        <div class="formInput"><strong>Typ turnaje:</strong> ${tournament.tournamentType}</div>
        <div class="formInput"><strong>Počet kol:</strong> ${tournament.tournamentRounds}</div>
        <div class="formInput"><strong>Datum:</strong> ${tournament.tournamentDate}</div>
    </div>
</main>
</body>
</html>