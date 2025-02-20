[#ftl]

<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Swiss Tracker - hráči</title>
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

    <h1>Seznam hráčů</h1>

    <h2>Master</h2>
    <table>
        <thead>
        <tr>
            <td>Pořadí</td>
            <td>ID hráče</td>
            <td>Jméno</td>
        </tr>
        </thead>
        <tbody>
        [#list players as player]
            [#if player.playerDivision == "master"]
                <tr>
                    <td>${player?counter}</td>
                    <td>${player.playerId}</td>
                    <td>${player.playerName}</td>
                </tr>
            [/#if]
        [/#list]</tbody>
    </table>

    <h2>Senior</h2>
    <table>
        <thead>
        <tr>
            <td>Pořadí</td>
            <td>ID hráče</td>
            <td>Jméno</td>
        </tr>
        </thead>
        <tbody>
        [#list players as player]
            [#if player.playerDivision == "senior"]
                <tr>
                    <td>${player?counter}</td>
                    <td>${player.playerId}</td>
                    <td>${player.playerName}</td>
                </tr>
            [/#if]
        [/#list]
        </tbody>
    </table>

    <h2>Junior</h2>
    <table>
        <thead>
        <tr>
            <td>Pořadí</td>
            <td>ID hráče</td>
            <td>Jméno</td>
        </tr>
        </thead>
        <tbody>
        [#list players as player]
            [#if player.playerDivision == "junior"]
                <tr>
                    <td>${player?counter}</td>
                    <td>${player.playerId}</td>
                    <td>${player.playerName}</td>
                </tr>
            [/#if]
        [/#list]</tbody>
    </table>
</main>
</body>
</html>