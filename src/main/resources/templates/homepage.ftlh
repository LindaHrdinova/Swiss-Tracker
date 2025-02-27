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
    <a href="/">Turnaj</a>
    <a href="/addPlayer">přidat hráče</a>
    <a href="/playersList">Seznam hráčů</a>
</nav>
<main>
    <h1>Vítej v turnaji!</h1>
    [#if tournament??]
        <div class="formInput"><strong>Název turnaje:</strong> ${tournament.tournamentName}</div>
        <div class="formInput"><strong>Pořadatel:</strong> ${tournament.tournamentOrganizer}</div>
        <div class="formInput"><strong>Typ turnaje:</strong> ${tournament.tournamentType}</div>
        <div class="formInput"><strong>Počet kol:</strong> ${tournament.tournamentRounds}</div>
        <div class="formInput"><strong>Datum:</strong> ${tournament.tournamentDate}</div>
        <a href="/editTournament">
            <button type="button">Upravit</button>
        </a>
        <a href="/playersList">
            <button type="button">Spravovat hráče</button>
        </a>
    [#else]
        <form method="post" action="/">
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
                <input type="date" name="tournamentDate" required>
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
                <button type="submit">Založit turnaj</button>
            </div>
        </form>
    [/#if]
</main>
</body>
</html>