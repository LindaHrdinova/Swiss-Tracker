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
    <h1>Vítej v turnaji!</h1>
    <form method="post" action="/tournamentData">
        <div class="formInput">
            <label for="tournamentName">Název turnaje *</label>
            <input type="text" name="tournamentName" required>
        </div>
        <div class="formInput">
            <label for="tournamentOrganizer">Pořadatel *</label>
            <input type="text" name="tournamentOrganizer" required>
        </div>
        <div class="formInput">
            <label for="tournamentDate">Datum turnaje</label>
            <input type="date" name="tournamentDate">
        </div>
        <div class="formInput">
            <label for="tournamentType">Typ turnaje *</label>
            <select name="tournamentType" required>
                <option value="pokemon">Pokémon</option>
            </select>
        </div>
        <div class="formInput">
            <label for="tournamentRounds">Počet kol *</label>
            <input type="number" min="1" max="10" name="tournamentRounds" required>
        </div>
        <div>
            <button type="submit">Pokračovat</button>
        </div>
    </form>
</main>
</body>
</html>