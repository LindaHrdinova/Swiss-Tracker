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
<main>
    <h1>Vítej v turnaji!</h1>
    <form method="post" action="/">
        <div class="formInput">
            <label for="tournamentName">Název turnaje *</label>
            <input type="text" name="tournamentName" required>
        </div>
        <div class="formInput">
            <label for="organisedBy">Pořadatel *</label>
            <input type="text" name="organisedBy" required>
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
            <label for="tournamentRoundsNumber">Počet kol *</label>
            <input type="number" min="1" max="10" name="tournamentRoundsNumber" required>
        </div>
        <div>
            <button type="submit">Pokračovat</button>
        </div>
    </form>
</main>
</body>
</html>