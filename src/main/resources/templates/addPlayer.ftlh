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
    <h1>Přidej hráče do turnaje</h1>
    <form method="post" action="/addPlayer">
        <div class="formInput">
            <label for="playerId">ID *</label>
            <input type="number" name="playerId" required>

        </div>
        <div class="formInput">
            <label for="playerName">Jméno hráče *</label>
            <input type="text" name="playerName" required>
        </div>
        <div class="formInput">
            <label for="playerBirthday">Datum narození *</label>
            <input type="date" name="playerBirthday" required>
        </div>
        <div>
            <button type="submit">Přidat</button>
        </div>
    </form>
</main>
</body>
</html>