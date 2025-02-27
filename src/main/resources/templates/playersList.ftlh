[#ftl]
[@l.page title=" - seznam hráčů"]
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
[/@l.page]