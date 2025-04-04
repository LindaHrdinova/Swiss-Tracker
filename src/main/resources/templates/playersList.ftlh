[#ftl]
[@l.page title=" - seznam hráčů"]
    <h1>Seznam hráčů</h1>

    [#if players?size == 0]
        <div class="container">Prázdný seznam hráčů.</div>
    [#else]
        [#list divisions as division]
            [#assign playersInDivision = players?filter(p -> p.division.id == division.id)]
            [#if playersInDivision?size > 0]
            <h2>${division.name?cap_first}</h2>
            <table>
                <thead>
                <tr>
                    <th>Pořadí</th>
                    <th>ID hráče</th>
                    <th>Jméno</th>
                    <th>Akce</th>
                </tr>
                </thead>
                <tbody>
                [#list players as player]
                    [#if player.division.id == division.id]
                        <tr>
                            <td>${player?counter}</td>
                            <td>${player.playerId}</td>
                            <td>${player.name}</td>
                            <td class="player-list__actions">
                                <a href="/editPlayer/${player.playerId}"
                                   class="player-list__button player-list__button--edit">
                                    <svg width="20" height="20" viewBox="0 0 24 24" fill="none"
                                         xmlns="http://www.w3.org/2000/svg">
                                        <path d="M4 20H20" stroke="white" stroke-width="2" stroke-linecap="round"/>
                                        <path d="M14.5 4.5L19.5 9.5L9 20H4V15L14.5 4.5Z" stroke="white" stroke-width="2"
                                              stroke-linecap="round" stroke-linejoin="round"/>
                                    </svg>
                                </a>
                                <form action="/deletePlayer" method="post">
                                    <input type="hidden" name="playerId" value="${player.playerId}">
                                    <button type="submit" class="player-list__button player-list__button--delete">
                                        <svg width="20" height="20" viewBox="0 0 24 24" fill="none"
                                             xmlns="http://www.w3.org/2000/svg">
                                            <path d="M3 6H5H21" stroke="white" stroke-width="2" stroke-linecap="round"/>
                                            <path d="M8 6V4C8 3.44772 8.44772 3 9 3H15C15.5523 3 16 3.44772 16 4V6M19 6V20C19 20.5523 18.5523 21 18 21H6C5.44772 21 5 20.5523 5 20V6H19Z"
                                                  stroke="white" stroke-width="2" stroke-linecap="round"
                                                  stroke-linejoin="round"/>
                                            <path d="M10 11V17" stroke="white" stroke-width="2" stroke-linecap="round"/>
                                            <path d="M14 11V17" stroke="white" stroke-width="2" stroke-linecap="round"/>
                                        </svg>
                                    </button>
                                </form>
                            </td>
                        </tr>
                    [/#if]
                [/#list]
                </tbody>
            </table>
            [/#if]
        [/#list]
    [/#if]

    <div class="button-container">
        <a href="/addPlayer">
            <button class="button" type="button">Přidat hráče</button>
        </a>
        <a href="/">
            <button class="button" type="button">Turnaj</button>
        </a>
    </div>
[/@l.page]